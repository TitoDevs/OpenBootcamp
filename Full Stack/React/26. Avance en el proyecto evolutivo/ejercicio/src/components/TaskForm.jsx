import React, { useContext, useState } from 'react';
import { TodoContext } from './TodoList';

const TaskForm = () => {
  const { state, dispatch } = useContext(TodoContext);
  const [inputValue, setInputValue] = useState('');

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (inputValue.trim() === '') {
      return;
    }
    const newTask = {
      id: Date.now(),
      title: inputValue,
      status: 'pending',
    };
    dispatch({ type: 'ADD_TASK', payload: newTask });
    setInputValue('');
  };

  const handleFilter = (status) => {
    dispatch({ type: 'FILTER_TASKS', payload: status });
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input type="text" value={inputValue} onChange={handleInputChange} />
        <button type="submit">Add task</button>
      </form>
      <div>
        <button onClick={() => handleFilter('all')}>All</button>
        <button onClick={() => handleFilter('pending')}>Pending</button>
        <button onClick={() => handleFilter('completed')}>Completed</button>
      </div>
    </div>
  );
};

export default TaskForm;
