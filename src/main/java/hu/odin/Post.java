package hu.odin;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Post extends PanacheEntity{
    public Long userId;
    public String title;
    public String body;

    public Post(){}
    
    public Post(Long userId, String title, String body){
        this.userId = userId;
        this.title = title;
        this.body = body;
    }
}
