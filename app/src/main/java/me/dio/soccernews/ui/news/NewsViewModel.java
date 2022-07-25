package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.ui.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover mocl de noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Corinthians bate galo no Mineirão","Com dois gols de Fábio Santos, Corinthians vira pra cima do Athletico"));
        news.add(new News("Palmeiras segue líder","Infelizmente"));
        news.add(new News("Mengão agora é menguinho","Time ruim que só a porra"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}