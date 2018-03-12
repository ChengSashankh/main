package seedu.address.logic.commands;

/**
 * Clears the address book.
 */
public class SkillsCommand extends UndoableCommand {

    public static final String COMMAND_WORD = "skills";
    // public static final String COMMAND_ALIAS = "sk";
    public static final String MESSAGE_SUCCESS = "Skills have been added!";


    @Override
    public CommandResult executeUndoableCommand() {
        // TODO: Exception to be thrown
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
