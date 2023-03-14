import React from 'react';
import RegisterFormik from '../../components/pure/forms/regiterFormik';
import { useHistory } from 'react-router-dom';
import { Button } from '@mui/material';

const RegisterPage = () => {
    const history = useHistory();

    const navigateTo = (path) => {
        history.push(path);
    }

    return (
        <div>
            <h1>Register Page</h1>
            <RegisterFormik></RegisterFormik>
            <Button onClick={() => navigateTo('/login')}>Go to Login</Button>
        </div>
    );
}

export default RegisterPage;
