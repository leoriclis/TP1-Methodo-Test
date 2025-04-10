package com.tp.article;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ArticleServiceTest {

    @Test
    void testAjouterArticle() {
        ArticleService service = new ArticleService();
        Article article = service.ajouterArticle("Stylo", 1.5);
        assertEquals("Stylo", article.getNom());
        assertEquals(1.5, article.getPrix());
        assertEquals(1, article.getId());
    }

    @Test
    void testSupprimerArticle() {
        ArticleService service = new ArticleService();
        Article a = service.ajouterArticle("Cahier", 2.0);
        assertTrue(service.supprimerArticle(a.getId()));
        assertFalse(service.supprimerArticle(a.getId()));
    }

    @Test
    void testGetTousLesArticles() {
        ArticleService service = new ArticleService();
        service.ajouterArticle("Crayon", 0.5);
        service.ajouterArticle("Gomme", 0.3);
        List<Article> articles = service.getTousLesArticles();
        assertEquals(2, articles.size());
    }
}
