import React, { useContext } from 'react';
import { TodoContext } from './TodoList';

const TaskList = () => {
  const { state, dispatch } = useContext(TodoContext);

  const handleCompletedTask = (id) => {
    dispatch({ type: 'FILTER_TASK', payload: id });
  };

  const handleDeleteTask = (id) => {
    dispatch({ type: 'DELETE_TASK', payload: id });
  };

  const filteredTasks =
    state.filter === 'all'
      ? state.tasks
      : state.tasks.filter((task) => task.status === state.filter);

  return (
    <div>
      <ul>
        {filteredTasks.map((task) => (
          <li key={task.id}>
            {task.title}
            <button onClick={() => handleDeleteTask(task.id)}>Delete</button>
            <button onClick={() => handleCompletedTask(task.status = 'completed')}>Completed</button>
            <button onClick={() => handleCompletedTask(task.status = 'pending')}>Pending</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TaskList;
