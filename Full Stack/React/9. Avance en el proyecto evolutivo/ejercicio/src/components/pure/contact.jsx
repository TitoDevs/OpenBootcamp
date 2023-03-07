import React, { useEffect } from 'react';
import PropTypes from 'prop-types';
import { Contact } from '../../models/contact.class';

// Importamos la hoja de estilos de task.scss
import '../../styles/contact.scss'
import { CONNECTION } from '../../models/connection.enum';


const ContactComponent = ({ contact, remove }) => {

    useEffect(() => {
        console.log('Created task')
        return () => {
            console.log(`Task: ${contact.name} is going to unmount`);
        };
    }, [contact]);

    /**
     * Funtion that returns a Badge
     * depending on the level of the task
     */
    function taskLevelBadge() {
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
                {taskLevelBadge()}
            </td>
            <td className='align-middle'>
                <i className='bi-trash contact-action' style={{ color: 'tomato'}} onClick={() => remove(contact)}></i>
            </td>
        </tr>
    );
};


ContactComponent.propTypes = {
    task: PropTypes.instanceOf(Contact).isRequired,
    remove: PropTypes.func.isRequired
};


export default ContactComponent;
