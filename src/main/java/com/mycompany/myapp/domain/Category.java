package com.mycompany.myapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "categories")
public class Category extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 254)
    @Column(length = 254, unique = true)
    private String name;

    @Size(max = 254)
    @Column(length = 254, unique = true)
    private String slug;

    private String description;

    @Column(name = "created_at")
    private Instant createdAt = null;

    @Column(name = "updated_at")
    private Instant updatedAt = null;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public String setSlug(String slug) {
        return this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        return this.description = description;
    }
}
