import React from 'react';
import Button from '@mui/material/Button'
import { useHistory } from 'react-router-dom';
import Copyright from '../../components/pure/Copyright';


const DashboardPage = () => {

    const history = useHistory();

    const logOut = () => {
        history.push('/login')
    }

    return (
        <div>
            <Button onClick={logOut} variant='contained'>Logout</Button>
            <Copyright></Copyright>
        </div>
    );
}

export default DashboardPage;
