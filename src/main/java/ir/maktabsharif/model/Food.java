package ir.maktabsharif.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Food {

    private Long id;
    private String name;
    private String category;
    private Integer price;

}
