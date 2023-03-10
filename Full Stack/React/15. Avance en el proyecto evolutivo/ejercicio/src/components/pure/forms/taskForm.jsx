import React, { useRef } from 'react';
import PropTypes from 'prop-types'
import { LEVELS } from '../../../models/levels.enum';
import { Task } from '../../../models/task.class';
import { Formik, Field, Form, ErrorMessage} from 'formik'
import * as Yup from 'yup';

const TaskForm = ({add, length}) => {
    const levelRef = useRef(LEVELS.NORMAL);

    const initialCredentials = {
        inputName: '',
        inputDescription: '',
        selectLevel: LEVELS.NORMAL
    };
    
    const taskSchema = Yup.object().shape({
        nameRef: Yup.string().required('Name is required'),
        descriptionRef: Yup.string().required('Description is required')
    });

    function addTask(values, { resetForm }, e) {
        e.preventDefault()
        const newTask = new Task(
            values.inputName,
            values.inputDescription,
            values.selectLevel
        );
    
    add(newTask);
    resetForm();
    }

    const normalStyle = {
        color: 'blue',
        fontWeight: 'bold'
    }

    const urgentStyle = {
        color: 'yellow',
        fontWeight: 'bold'
    }

    const blockingStyle = {
        color: 'tomato',
        fontWeight: 'bold'
    }

    return (
        <div>
            <Formik
                initialValues={ initialCredentials }
                validationSchema={ taskSchema }
                onSubmit={ addTask }>

                {({ values,
                    touched,
                    errors,
                    isSubmitting,
                    handleChange,
                    handleBlur }) => (
                        <Form className='d-flex justify-content-center align-items-center mb-4'>
                            <div className='form-outline flex-fill'>
                                <label htmlFor='input-name'>Name</label>
                                <Field
                                    id="input-name"
                                    name="inputName"
                                    required
                                    autoFocus
                                    placeholder="Task Name"
                                    type="text"
                                    className="form-control form-control-lg"
                                    />
                                {/* Name Errors */}
                                {
                                    errors.inputName && touched.inputName && (
                                        <ErrorMessage name='input-name' component='div'/>
                                    )
                                }
                                <label htmlFor='input-description'>Description</label>
                                <Field
                                    id="input-description"
                                    name="inputDescription"
                                    required
                                    placeholder="Task Description"
                                    type="text"
                                    className="form-control form-control-lg"
/>
                                {/* Description Errors */}
                                {
                                    errors.inputDescription && touched.inputDescription && (
                                        <ErrorMessage name='input-description' component='div'/>
                                    )
                                }
                                <select
                                    className="form-control form-control-lg"
                                    name="selectLevel"
                                    ref={levelRef}
                                    defaultValue={LEVELS.NORMAL}
                                    id="selectLevel"
                                    >
                                    <option style={normalStyle} value={LEVELS.NORMAL}>
                                        Normal
                                    </option>
                                    <option style={urgentStyle} value={LEVELS.URGENT}>
                                        Urgent
                                    </option>
                                    <option style={blockingStyle} value={LEVELS.BLOCKING}>
                                        Blocking
                                    </option>
                                </select>
                            </div>
                            <button className='btn btn-success btn-lg ms-2' type='submit'>
                                { isSubmitting ? 'Bien' : 'Mal' }
                            </button>
                        </Form>
                    )
                }
            </Formik>
        </div>
    );

    
}

TaskForm.protoTypes = {
    add: PropTypes.func.isRequired,
    length: PropTypes.number.isRequired
}

export default TaskForm;
