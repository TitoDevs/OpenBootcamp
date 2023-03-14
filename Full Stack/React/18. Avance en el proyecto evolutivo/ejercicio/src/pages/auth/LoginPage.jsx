import { Button } from '@mui/material';
import React from 'react';
import { useHistory } from 'react-router-dom';
import LoginFormik from '../../components/pure/forms/loginFormik';

const LoginPage = () => {

    const history = useHistory();

    const navigateTo = (path) => {
        history.push(path);
    }

    return (
        <div>
            <h1>Login Page</h1>
            <LoginFormik></LoginFormik>
            <Button onClick={() => navigateTo('/register')}>Go to Register</Button>
        </div>
    );
}

export default LoginPage;
