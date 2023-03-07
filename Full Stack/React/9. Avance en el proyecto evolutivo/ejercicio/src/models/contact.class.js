import { CONNECTION } from "./connection.enum";

export class Contact {
    name = "";
    surname = "";
    connection = CONNECTION.CONNECTED;

    constructor(name, surname, connection) {
        this.name = name;
        this.surname = surname;
        this.connection = connection;
    }
}