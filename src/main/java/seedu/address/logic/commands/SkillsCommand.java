package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_SKILLS;

import seedu.address.commons.core.index.Index;
import seedu.address.model.person.SkillsList;

/**
 * Clears the address book.
 */
public class SkillsCommand extends UndoableCommand {

    private final Index index;
    private final SkillsList skillsList;

    public static final String COMMAND_WORD = "skills";
    // public static final String COMMAND_ALIAS = "sk";
    public static final String MESSAGE_SUCCESS = "Skills have been added!";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds skill list to person identified "
            + "by the index number used in the last person listing. "
            + "Existing skills list will be appended by the input values.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "[" + PREFIX_SKILLS + "NAME]"
            + "Example: " + COMMAND_WORD + " 1 "
            + PREFIX_SKILLS + "Java, JavaScript, C++";

    // TODO: Create a skillsCommandDescriptor to contain the skills as obejects later
    public SkillsCommand(Index index, SkillsList skillsList) {
        requireNonNull(index);
        requireNonNull(skillsList);

        this.index = index;
        this.skillsList = skillsList;
    }

    @Override
    public CommandResult executeUndoableCommand() {
        // TODO: Exception to be thrown


        return new CommandResult(MESSAGE_SUCCESS);
    }
}

