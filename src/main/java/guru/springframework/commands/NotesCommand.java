package guru.springframework.commands;

import guru.springframework.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private String recipeNotes;
    private RecipeCommand recipe;
}
