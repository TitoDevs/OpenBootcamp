import React, { useRef } from 'react';
import PropTypes from 'prop-types'
import { CONNECTION } from '../../../models/connection.enum';
import { Contact } from '../../../models/contact.class';

const ContactForm = ({add}) => {

    const nameRef = useRef('');
    const surnameRef = useRef('');
    const connectionRef = useRef(CONNECTION.DISCONNECTED);

    function addContact(e) {
        e.preventDefault();
        const newContact = new Contact(
            nameRef.current.value,
            surnameRef.current.value,
            connectionRef.current.value
        );

        add(newContact);
    }

    return (
        <form onSubmit={addContact} className='d-flex justify-content-center align-items-center mb-4'>
            <div className='form-outline flex-fill'>
                <input ref={nameRef} id='input-name' type='text' className='form-control form-control-lg' required autoFocus placeholder='Contact Name'/>
                <input ref={surnameRef} id='input-description' type='text' className='form-control form-control-lg' required placeholder='Contact Surname'/>
                <label htmlFor='selectConnection' className='sr-only'>Connection</label>
                <select ref={connectionRef} defaultValue={ CONNECTION.DISCONNECTED } id='selectConnection'>
                    <option value={CONNECTION.CONNECTED}>
                        Connected
                    </option>
                    <option value={CONNECTION.DISCONNECTED}>
                        Disconnected
                    </option>
                </select>
            </div>
            <button type='submit' className='btn btn-success btn-lg ms-2'>Add</button>
        </form>
    );
}

ContactForm.protoType = {
    add: PropTypes.func.isRequired
}

export default ContactForm;
