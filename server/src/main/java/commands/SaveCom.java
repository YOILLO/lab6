package commands;

import collection.CollectionManager;
import messages.AnswerMsg;

/**
 * Save collection command
 */
public class SaveCom extends commands.AbstractCommand {
    CollectionManager collection;

    public SaveCom(CollectionManager coll)
    {
        super("save", " : сохранить коллекцию в файл");
        collection = coll;
    }

    @Override
    public boolean execute(String argument, Object objArg, AnswerMsg answerMsg) {
        collection.Save();
        answerMsg.addMsg("Сохранено");
        return true;
    }
}
