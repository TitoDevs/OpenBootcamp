import React from 'react'
import PropTypes from 'prop-types'
import { Formik, Form, Field, ErrorMessage } from 'formik';
import * as Yup from 'yup'

import { Redirect } from 'react-router-dom'

const loginSchema = Yup.object().shape(
    {
        email: Yup.string()
                    .email('Invalid email format')
                    .required('Email is required'),
        password: Yup.string()
                    .required('Password is required')
    }
);

const LoginForm = ({logged, fetching,  onLogin}) => {

    const initialCredentials = {
        email: '',
        password: ''
    }

    return (
        <div>
            <h4>Login Formik</h4>
            <Formik
                // *** Initial values that the form will take
                initialValues={ initialCredentials }
                // *** Yup Validation Schema ***
                validationSchema={ loginSchema }
                // *** onSubmit Event
                onSubmit={ async (values) => {
                    onLogin(values.email, values.password)
                }}>

                {/* We obtain props from Formik */}
                {({ values,
                    touched,
                    errors,
                    isSubmitting,
                    handleChange,
                    handleBlur }) => (
                        <Form>
                            <label htmlFor='email'>Email</label>
                            <Field id='email' name='email' placeholder='Email' type='email'/>
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

                            <button type='submit'>Submit</button>
                            { fetching ? (<p>LOADING...</p>) : null}
                            { isSubmitting ? (<p>Login your credentianls...</p>) : null }
                        </Form>
                    )
                }
            </Formik>
        </div>
    );
}

LoginForm.propTypes = {
    logged: PropTypes.bool.isRequired,
    fetching: PropTypes.bool.isRequired,
    onLogin: PropTypes.func.isRequired
}

export default LoginForm 