package com.github.stii.grpc.greeting.server;

import com.proto.fib.Fib;
import com.proto.fib.FibRequest;
import com.proto.fib.FibResponse;
import com.proto.fib.FibServiceGrpc;
import io.grpc.stub.StreamObserver;

public class FibServiceImpl extends FibServiceGrpc.FibServiceImplBase {
    @Override
    public void fib(FibRequest request, StreamObserver<FibResponse> responseObserver) {
        Fib fib = request.getFib();
        int n = fib.getNumber();

        long result = calcFib(n, 0, 1);

        FibResponse response = FibResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    private long calcFib(int n, long a, long b) {
        if (n == 0) {
            return a;
        }
        return calcFib(n - 1, b, a + b);
    }
}
