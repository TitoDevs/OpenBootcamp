import React, { useState, useEffect } from 'react';
import { CONNECTION } from '../../models/connection.enum';
import { Contact } from '../../models/contact.class';
import ContactComponent from '../pure/contact';

// Importamos la hoja de estilos de contact.scss
import '../../styles/contact.scss'
import ContactForm from '../pure/forms/contactForm';

const ContactListComponent = () => {
    const defaultContact1 = new Contact("Name1", "Surname1", CONNECTION.CONNECTED);
    const defaultContact2 = new Contact("Name2", "Surname2", CONNECTION.DISCONNECTED);

    // Estado del componente
    const [contacts, setContacts] = useState([defaultContact1, defaultContact2]);

    // Control del ciclo de vida del componente
    useEffect(() => {
        console.log('Contact State has been modified');
        return () => {
            console.log('ContactList component is going to unmount...');
        };
    }, [contacts]);

    function removeContact(contact) {
        console.log('Delete this contact: ', contact);
        const index = contacts.indexOf(contact);
        const tempContacts = [...contacts];
        tempContacts.splice(index, 1);
        setContacts(tempContacts);
    }

    function addContact(contact) {
        console.log('Add this contact: ', contact);
        const tempContacts = [...contacts];
        tempContacts.push(contact);
        setContacts(tempContacts);
    }

    function changeConnectionContact(contact) {
        console.log('Change connection this contact: ', contact);
        const index = contacts.indexOf(contact);
        const tempContacts = [...contacts]
        if(tempContacts[index].connection === CONNECTION.CONNECTED) {
            tempContacts[index].connection = CONNECTION.DISCONNECTED;
        } else {
            tempContacts[index].connection = CONNECTION.CONNECTED;
        }
        setContacts(tempContacts);
    }

    return (
        <div>
            <div className='col-12'>
                <div className='card'>
                    {/* Card Header (title) */}
                    <div className='card-header p-3'>
                        <h5>
                            Contacts
                        </h5>
                    </div>
                    {/* Card Body (content) */}
                    <div className='card-body' data-mdb-perfect-scrollbar='true' style={ {position: 'relative', height: '400px'} }>
                        <table>
                            <thead>
                                <tr>
                                    <th scope='col'>Name</th>
                                    <th scope='col'>Surname</th>
                                    <th scope='col'>Connection</th>
                                </tr>
                            </thead>
                            <tbody>
                                {contacts.map((contact, index) => {
                                    return (
                                        <ContactComponent 
                                            key={index} 
                                            contact={contact}
                                            remove={removeContact}
                                            change={changeConnectionContact}>
                                        </ContactComponent>
                                    )
                                })}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <ContactForm add={addContact}></ContactForm>
        </div>
    );
};

export default ContactListComponent;
