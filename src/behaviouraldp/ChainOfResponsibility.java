package behaviouraldp;

import java.util.HashMap;
import java.util.Map;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        BaseHandler base = new UserExistsHandler(db)
                                .setNext(new ValidPasswordHandler(db));

        boolean res = base.handle("admin", "admin");
        if (res) {
            System.out.println("User authenticated!");
        } else {
            System.out.println("User not authenticated!");
        }
    }
}

class DataBase {
    private Map<String, String> users;

    public DataBase() {
        users = new HashMap<>();
        users.put("admin", "admin");
        users.put("user", "user");
        users.put("ankush", "ankush");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }

}

//interface Handler {
//    void setNext(Handler next);
//    void handleRequest(String username, String password);
//}

abstract class BaseHandler {
    private BaseHandler next;

    public BaseHandler setNext(BaseHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next != null) {
            return next.handle(username, password);
        }
        return true;
    }
}


class UserExistsHandler extends BaseHandler {
    private DataBase dataBase;

    public UserExistsHandler(DataBase db) {
        this.dataBase = db;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!dataBase.isValidUser(username)) {
            System.out.println("Username not registered!");
            return false;
        }
        return handleNext(username, password);
    }
}

class ValidPasswordHandler extends BaseHandler {
    private DataBase database;

    public ValidPasswordHandler(DataBase db) {
        this.database = db;
    }

    @Override
    public boolean handle(String username, String password) {
        if (database.isValidPassword(username, password)) {
            return handleNext(username, password);
        }
        return false;
    }
}

