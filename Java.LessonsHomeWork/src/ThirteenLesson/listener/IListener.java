package ThirteenLesson.listener;

public interface IListener<L> {
    void onSuccess(L object);

    void onFailure();
}
