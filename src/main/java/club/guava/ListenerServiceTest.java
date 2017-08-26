package club.guava;

import com.google.common.util.concurrent.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.annotation.Nullable;
import java.util.concurrent.*;

/**
 * Created by ty on 2017/8/26.
 */
public class ListenerServiceTest {


    public static void main(String[] args) {
        ListeningExecutorService executorService = MoreExecutors.listeningDecorator(new ThreadPoolExecutor(1,5,5000, TimeUnit.MINUTES,new LinkedBlockingDeque<Runnable>(10)));
        for (int i = 0; i < 100; i++) {
            final int finalI = i;
            ListenableFuture<String> submit = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println(Thread.currentThread().getName()+" ，执行的值 "+ finalI);
//                int a= 1/0;
                    return "您好啊"+String.valueOf(finalI);
                }
            });

            Futures.addCallback(submit, new FutureCallback<String>() {
                @Override
                public void onSuccess(@Nullable String s) {
                    System.out.println("值： "+s+"   ，成功执行线程: " + Thread.currentThread().getName());
                }

                @Override
                public void onFailure(Throwable throwable) {
                    System.out.println("执行失败" + throwable.getMessage());
                    System.out.println("失败执行线程: " + Thread.currentThread().getName());
                }
            }, executorService);

        }
    }


}
