import React from 'react';
import { Formik, Form, Field, ErrorMessage } from 'formik';
import * as Yup from 'yup';

// Models
import { User } from '../../../models/users.class';
import { ROLES } from '../../../models/roles.enum';

const RegiterFormik = () => {

    let user = new User();

    const initialValues = {
        username: '',
        email: '',
        password: '',
        confirm: '',
        role: ROLES.USER
    }

    const registerSchema = Yup.object().shape(
        {
            username: Yup.string()
                .min(6, 'Username too short')
                .max(12, 'Username too long')
                .required('Username is required'),
            email: Yup.string()
                .email('Invalid email format')
                .required('Email is required'),
            role: Yup.string()
                .oneOf([ROLES.USER, ROLES.ADMIN], 'You must select a role: User or Admin')
                .required('Rol is required'),
            password: Yup.string()
                .min(8, 'Password too short')
                .required('Password is required'),
            confirm: Yup.string()
                .when('password', {
                    is: value => (value && value.length > 0 ? true : false),
                    then: Yup.string().oneOf(
                        [Yup.ref('password')],
                        'Passwords must match!'
                    )
                }).required('You must confirm the password')
        }
    )

    const submit = () => {
        alert('Register user')
    }

    return (
        <div>
            <h4>Register Formik</h4>
            <Formik 
                initialValues={initialValues}
                validationSchema={registerSchema}
                onSubmit={ async (values) => {
                    await new Promise((r) => setTimeout(r, 1000));
                    alert(JSON.stringify(values, null, 2));
                }}>
            
                {/* We obtain props from Formik */}
                {({ values,
                    touched,
                    errors,
                    isSubmitting,
                    handleChange,
                    handleBlur }) => (
                        <Form>
                            <label htmlFor='username'>Username</label>
                            <Field id='username' name='username' placeholder='User' type='text'/>

                            {/* Username Errors */}
                            {
                                errors.username && touched.username && (
                                    <ErrorMessage name='username' component='div'/>
                                )
                            }

                            <label htmlFor='email'>Email</label>
                            <Field id='email' name='email' placeholder='email' type='email'/>

                            {/* Email Errors */}
                            {
                                errors.email && touched.email && (
                                    <ErrorMessage name='email' component='div'/>
                                )
                            }

                            <label htmlFor='password'>Password</label>
                            <Field id='password' name='password' placeholder='password' type='password'/>
                            {/* Password Errors */}
                            {
                                errors.password && touched.password && (
                                    <ErrorMessage name='password' component='div'/>
                                )
                            }

                            <label htmlFor='confirm'>Password</label>
                            <Field id='confirm' name='confirm' placeholder='confirm password' type='password'/>
                            {/* Confirm Password Errors */}
                            {
                                errors.confirm && touched.confirm && (
                                    <ErrorMessage name='confirm' component='div'/>
                                )
                            }

                            <button type='submit'>Register Account</button>
                            { isSubmitting ? (<p>Sending your credentianls...</p>) : null }

                        </Form>
                    )
                }

            </Formik>
        </div>
    );
}

export default RegiterFormik;
