package com.proto.fib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: fib/fib.proto")
public final class FibServiceGrpc {

  private FibServiceGrpc() {}

  public static final String SERVICE_NAME = "fib.FibService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.fib.FibRequest,
      com.proto.fib.FibResponse> getFibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fib",
      requestType = com.proto.fib.FibRequest.class,
      responseType = com.proto.fib.FibResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.fib.FibRequest,
      com.proto.fib.FibResponse> getFibMethod() {
    io.grpc.MethodDescriptor<com.proto.fib.FibRequest, com.proto.fib.FibResponse> getFibMethod;
    if ((getFibMethod = FibServiceGrpc.getFibMethod) == null) {
      synchronized (FibServiceGrpc.class) {
        if ((getFibMethod = FibServiceGrpc.getFibMethod) == null) {
          FibServiceGrpc.getFibMethod = getFibMethod = 
              io.grpc.MethodDescriptor.<com.proto.fib.FibRequest, com.proto.fib.FibResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fib.FibService", "Fib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.fib.FibRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.fib.FibResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FibServiceMethodDescriptorSupplier("Fib"))
                  .build();
          }
        }
     }
     return getFibMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FibServiceStub newStub(io.grpc.Channel channel) {
    return new FibServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FibServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FibServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FibServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FibServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FibServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fib(com.proto.fib.FibRequest request,
        io.grpc.stub.StreamObserver<com.proto.fib.FibResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFibMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFibMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.fib.FibRequest,
                com.proto.fib.FibResponse>(
                  this, METHODID_FIB)))
          .build();
    }
  }

  /**
   */
  public static final class FibServiceStub extends io.grpc.stub.AbstractStub<FibServiceStub> {
    private FibServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServiceStub(channel, callOptions);
    }

    /**
     */
    public void fib(com.proto.fib.FibRequest request,
        io.grpc.stub.StreamObserver<com.proto.fib.FibResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFibMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FibServiceBlockingStub extends io.grpc.stub.AbstractStub<FibServiceBlockingStub> {
    private FibServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.fib.FibResponse fib(com.proto.fib.FibRequest request) {
      return blockingUnaryCall(
          getChannel(), getFibMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FibServiceFutureStub extends io.grpc.stub.AbstractStub<FibServiceFutureStub> {
    private FibServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.fib.FibResponse> fib(
        com.proto.fib.FibRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFibMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FibServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FibServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIB:
          serviceImpl.fib((com.proto.fib.FibRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.fib.FibResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FibServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FibServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.fib.FibOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FibService");
    }
  }

  private static final class FibServiceFileDescriptorSupplier
      extends FibServiceBaseDescriptorSupplier {
    FibServiceFileDescriptorSupplier() {}
  }

  private static final class FibServiceMethodDescriptorSupplier
      extends FibServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FibServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FibServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FibServiceFileDescriptorSupplier())
              .addMethod(getFibMethod())
              .build();
        }
      }
    }
    return result;
  }
}
