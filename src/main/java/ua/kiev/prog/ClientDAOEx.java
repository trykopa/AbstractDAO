package ua.kiev.prog;

import ua.kiev.prog.AbstractDAO;
import ua.kiev.prog.shared.Client;

import java.sql.Connection;

/**
 * Created by Bios on 29.11.2017.
 */
public class ClientDAOEx extends AbstractDAO<Integer, Client> {
    public ClientDAOEx(Connection conn, String table) {
        super(conn, table);
    }
}
