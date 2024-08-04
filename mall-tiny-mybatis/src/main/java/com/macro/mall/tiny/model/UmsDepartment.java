package com.macro.mall.tiny.model;

import com.sun.istack.internal.NotNull;
import lombok.*;

import java.io.Serializable;


@Data
@RequiredArgsConstructor
public class UmsDepartment implements Serializable {
    @NonNull
    private long id;
    private String name;

    @EqualsAndHashCode.Exclude
    private Integer number;
}
