package 后端.Java常用设计模式.观察者模式;

/**
 * Created by SachsFang on 2021/7/16 11:59
 */
public class FirstObserver extends Observer {
    FirstObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("FirstObserver already update");
    }
}
