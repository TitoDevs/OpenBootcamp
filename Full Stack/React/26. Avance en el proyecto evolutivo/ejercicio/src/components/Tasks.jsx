import React, { useState, useReducer, useContext } from 'react';

// Actions
const CREATE = 'CREATE';
const DELETE = 'DELETE';
const FILTER = 'FILTER';

const myContext = React.createContext('');

const TasksList = () => {
    const state = useContext(myContext);
    return (
        <p>{ state.task }</p>
    )
}

const Tasks = () => {

    const [tasks, setTasks] = useState([]);

    const initialState = tasks

    // Reducer to change State
    const reducer = (state, action) => {
        switch (action.type) {
            case CREATE:
                return {
                    task: setTasks(state.task)
                }
            case DELETE:
                return {
                    count: state.count - action.payload.quantity
                }
            case FILTER:
                return {
                    count: 0
                }
            default:
                return state;
        }
    }

    // Asign useReducere to state, reducer and dispatch actions
    const [state, dispatch] = useReducer(reducer, initialState)

    // Obtain all variables from state
    const { task } = state;

    return (
        <myContext.Provider value={state}>
            <div>
                <h1>TaskList:</h1>
                <TasksList></TasksList>
                <input type='text' placeholder='Task' value={task}></input>
                <div>
                    <button
                        onClick={
                            () => dispatch({ 
                                type: CREATE, 
                                payload: {
                                    quantity: 1
                                } 
                            })
                        }>
                        CREATE
                    </button>
                    <button
                        onClick={
                            () => dispatch({ 
                                type: DELETE,
                                payload: {
                                    quantity: 1
                                }
                            })
                        }>
                        DELETE
                    </button>
                    <button
                        onClick={
                            () => dispatch({ 
                                type: FILTER
                            })
                        }>
                        FILTER
                    </button>
                </div>
                
            </div>
        </myContext.Provider>
    );
}

export default Tasks;
