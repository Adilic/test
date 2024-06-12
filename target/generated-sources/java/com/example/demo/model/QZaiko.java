package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QZaiko is a Querydsl query type for Zaiko
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QZaiko extends EntityPathBase<Zaiko> {

    private static final long serialVersionUID = -1696531417L;

    public static final QZaiko zaiko = new QZaiko("zaiko");

    public final DatePath<java.time.LocalDate> expiryDate = createDate("expiryDate", java.time.LocalDate.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath productName = createString("productName");

    public final DateTimePath<java.time.LocalDateTime> storageDate = createDateTime("storageDate", java.time.LocalDateTime.class);

    public QZaiko(String variable) {
        super(Zaiko.class, forVariable(variable));
    }

    public QZaiko(Path<? extends Zaiko> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZaiko(PathMetadata metadata) {
        super(Zaiko.class, metadata);
    }

}

