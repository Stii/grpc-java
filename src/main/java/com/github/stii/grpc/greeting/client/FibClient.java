package com.github.stii.grpc.greeting.client;

import com.proto.fib.Fib;
import com.proto.fib.FibRequest;
import com.proto.fib.FibResponse;
import com.proto.fib.FibServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class FibClient {
    public static void main(String[] args) {
        System.out.println("Hello from the gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        FibServiceGrpc.FibServiceBlockingStub fibClient = FibServiceGrpc.newBlockingStub(channel);
        Fib fib = Fib.newBuilder()
                .setNumber(10)
                .build();

        FibRequest fibRequest = FibRequest.newBuilder()
                .setFib(fib)
                .build();

        FibResponse fibResponse = fibClient.fib(fibRequest);
        System.out.println(fibResponse.getResult());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
