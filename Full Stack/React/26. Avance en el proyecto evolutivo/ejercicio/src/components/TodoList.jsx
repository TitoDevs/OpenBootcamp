import React, { createContext, useReducer } from 'react';
import TaskForm from './TaskForm';
import TaskList from './TaskList';

const initialState = {
  tasks: [],
  filter: 'all',
};

export const TodoContext = createContext(null);

const todoReducer = (state, action) => {
  switch (action.type) {
    case 'ADD_TASK':
      return {
        ...state,
        tasks: [...state.tasks, action.payload],
      };
    case 'DELETE_TASK':
      return {
        ...state,
        tasks: state.tasks.filter((task) => task.id !== action.payload),
      };
    case 'FILTER_TASKS':
      return {
        ...state,
        filter: action.payload,
      };
    default:
      return state;
  }
};

const TodoList = ({ children }) => {
  const [state, dispatch] = useReducer(todoReducer, initialState);

  return (
    <TodoContext.Provider value={{ state, dispatch }}>
      {children}
      <TaskList></TaskList>
      <TaskForm></TaskForm>
    </TodoContext.Provider>
  );
};

export default TodoList;
