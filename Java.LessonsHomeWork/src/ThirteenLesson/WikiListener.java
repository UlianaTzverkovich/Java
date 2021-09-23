package ThirteenLesson;

import ThirteenLesson.listener.IListener;

import java.util.List;

public class WikiListener implements IListener<WikiDTO> {
    @Override
    public void onSuccess(WikiDTO object) {
        List<WikiDTO.Search> searchList = object.query.search;
        for (WikiDTO.Search search : searchList) {
            System.out.println("Заголовок: " + search.title);
            System.out.println("Описание: " + search.snippet + "\n");
        }
    }

    @Override
    public void onFailure() {
        System.out.println("При выполнении запроса произошла ошибка");
    }
}

