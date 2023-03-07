import React, { useEffect } from 'react';
import PropTypes from 'prop-types';
import { Contact } from '../../models/contact.class';

// Importamos la hoja de estilos de task.scss
import '../../styles/contact.scss'
import { CONNECTION } from '../../models/connection.enum';


const ContactComponent = ({ contact, remove, change }) => {

    useEffect(() => {
        console.log('Created contact')
        return () => {
            console.log(`Contact: ${contact.name} is going to unmount`);
        };
    }, [contact]);

    /**
     * Funtion that returns a Badge
     * depending on the connection of the contact
     */
    function contactConnectionBadge() {
        switch (contact.connection) {
            case CONNECTION.CONNECTED:
                return(
                    <h6 className='mb-0'>
                        <span className='badge bg-success'>{contact.connection}</span>
                    </h6>
                )
            case CONNECTION.DISCONNECTED:
                return(
                    <h6 className='mb-0'>
                        <span className='badge bg-danger'>{contact.connection}</span>
                    </h6>
                )
            default:
                break;
        }
    }

    function changeToggle() {
        switch (contact.connection) {
            case CONNECTION.CONNECTED:
                return(
                    <i className='bi bi-toggle-on contact-action' style={{ color: 'green'}} onClick={() => change(contact)}></i>
                )
            case CONNECTION.DISCONNECTED:
                return(
                    <i className='bi bi-toggle-off contact-action' style={{ color: 'grey'}} onClick={() => change(contact)}></i>
                )
            default:
                break;
        }
    }
    
    return (
        <tr className='fw-normal'>
            <th>
                <span className='ms-2'>{contact.name}</span>
            </th>
            <td className='align-middle'>
                <span>{contact.surname}</span>
            </td>
            <td className='align-middle'>
                {/* Execution of function to return badge element */}
                {contactConnectionBadge()}
            </td>
            <td className='align-middle'>
                {changeToggle()}
            </td>
            <td className='align-middle'>
                <i className='bi-trash contact-action' style={{ color: 'tomato'}} onClick={() => remove(contact)}></i>
            </td>
        </tr>
    );
};


ContactComponent.propTypes = {
    task: PropTypes.instanceOf(Contact).isRequired,
    remove: PropTypes.func.isRequired,
    change: PropTypes.func.isRequired
};


export default ContactComponent;
