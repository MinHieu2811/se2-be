package main.repository.category.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryRepoModel {

    @Column(nullable = false, length = 100)
    @Id
    public String id;

    @Column(nullable = false, length = 100)
    public String name;

    public CategoryRepoModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryRepoModel() {

    }
}
