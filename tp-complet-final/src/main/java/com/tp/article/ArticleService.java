package com.tp.article;

import java.util.*;

public class ArticleService {
    private Map<Integer, Article> articles = new HashMap<>();
    private int nextId = 1;

    public Article ajouterArticle(String nom, double prix) {
        Article article = new Article(nextId++, nom, prix);
        articles.put(article.getId(), article);
        return article;
    }

    public boolean supprimerArticle(int id) {
        return articles.remove(id) != null;
    }

    public List<Article> getTousLesArticles() {
        return new ArrayList<>(articles.values());
    }
}
