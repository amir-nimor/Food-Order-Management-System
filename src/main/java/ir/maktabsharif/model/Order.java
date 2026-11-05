package ir.maktabsharif.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Order {

    private Long id;
    private String customerName;
    private Food food;
    private Integer quantity;

}
