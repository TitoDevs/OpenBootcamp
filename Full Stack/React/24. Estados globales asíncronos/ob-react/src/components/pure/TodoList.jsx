import React from 'react';
import Proptypes from 'prop-types'
import Todo from './Todo';

const TodoList = ({todos, onTodoClick}) => {
    return (
        <div>
            <h1>Your TODOs</h1>
            <ul>
                {todos.map((todo, index) => 
                    (
                        <Todo 
                            key={index}
                            {...todo} // id, text, completed
                            onClick = {
                                () => onTodoClick(todo.id)
                            }>
                        </Todo>
                    )
                )}
            </ul>
        </div>
    );
}

TodoList.propTypes = {
    todos: Proptypes.arrayOf(
        Proptypes.shape(
            {
                id: Proptypes.number.isRequired,
                text: Proptypes.string.isRequired,
                completed: Proptypes.bool.isRequired
            }
        ).isRequired
    ).isRequired,
    onTodoClick: Proptypes.func.isRequired
}

export default TodoList;
