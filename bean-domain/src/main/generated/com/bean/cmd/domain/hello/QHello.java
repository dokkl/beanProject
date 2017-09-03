package com.bean.cmd.domain.hello;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHello is a Querydsl query type for Hello
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHello extends EntityPathBase<Hello> {

    private static final long serialVersionUID = 1276647601L;

    public static final QHello hello = new QHello("hello");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QHello(String variable) {
        super(Hello.class, forVariable(variable));
    }

    public QHello(Path<? extends Hello> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHello(PathMetadata<?> metadata) {
        super(Hello.class, metadata);
    }

}

