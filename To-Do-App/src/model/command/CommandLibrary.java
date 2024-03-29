package model.command;

public class CommandLibrary {

    public static final int PAGE_NUMBER_DEFAULT_VALUE = 1;
    public static final int PAGE_CAPACITY_DEFAULT_VALUE = 50;
    public static final int MAX_PAGE_CAPACITY = 1000;

    private static final String description =
            "> help                    ask help\n" +
            "> new                     create new To-Do list (previous data will be lost)\n" +
            "> add <task_name>         add new task\n" +
            "> rm <task_id>            remove task by id\n" +
            "> ch <task_id>            check or uncheck task by id\n" +
            "> show [-options]         show tasks\n" +
            "  where options include:\n" +
            "   -a                     all (by default)\n" +
            "   -d                     only done\n" +
            "   -u                     only undone\n" +
            "   -pc <page_capacity>    specify max task amount on one page (default value = " + PAGE_CAPACITY_DEFAULT_VALUE + ", max value = " + MAX_PAGE_CAPACITY + ")\n" +
            "   -p <page_number>       specify page of task list (default value = " + PAGE_NUMBER_DEFAULT_VALUE + ")";

    public static String getDescription() {
        return description;
    }
}
