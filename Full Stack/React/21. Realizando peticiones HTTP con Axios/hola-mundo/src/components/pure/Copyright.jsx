import React from 'react';

// Material UI Components
import Link from '@mui/material/Link';
import { Typography } from '@mui/material';

const Copyright = () => {
    return (
        <Typography variant='body2' color={'GrayText'} align='center'>
            { ' CopyRight (C)' }
            <Link color={'inherit'} href='https://worldevs.es/'>
                Worldevs
            </Link>
            { ' ' }
            { new Date().getFullYear() }
        </Typography>
    );
}

export default Copyright;
