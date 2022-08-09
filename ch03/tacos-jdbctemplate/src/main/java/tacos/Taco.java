package tacos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {

  private Long id;

  private Date createdAt = new Date();

  @NotNull
  //该字段不得为空
  @Size(min=5, message="Name must be at least 5 characters long")
//  该字段长度最小为5
  private String name;

  @Size(min=1, message="You must choose at least 1 ingredient")
// 最小需要选择一个taco菜
  private List<IngredientRef> ingredients = new ArrayList<>();

  public void addIngredient(Ingredient taco) {
    this.ingredients.add(new IngredientRef(taco.getId()));
  }

}
