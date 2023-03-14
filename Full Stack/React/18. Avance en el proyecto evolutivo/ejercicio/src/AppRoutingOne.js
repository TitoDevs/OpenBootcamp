import { BrowserRouter as Router, Route, Switch, Link, Redirect } from 'react-router-dom'
import { useEffect, useState } from 'react';
import HomePage from './pages/home/HomePage';
import NotFoundPage from './pages/404/NotFoundPage'
import TasksPage from './pages/tasks/TasksPage';
import TaskDetailPage from './pages/tasks/TaskDetailPage';
import LoginPage from './pages/auth/LoginPage';
import RegisterPage from './pages/auth/RegisterPage';

function AppRoutingOne() {

  const [logged, setLogged] = useState(false);

  let taskList = [
    {
      id: 1,
      name: 'Task1',
      description: 'My first task'
    },
    {
      id: 2,
      name: 'Task2',
      description: 'My second task'
    },
    {
      id: 3,
      name: 'Task3',
      description: 'My third task'
    }
  ]

  useEffect(() => {
    const credentials = localStorage.getItem('credentials');
    setLogged(credentials)
  }, []);

  return (
    <Router>
      <div className='App'>
        <aside>
          <Link to='/'>|| Home |</Link>
          <Link to='/tasks'>| Tasks |</Link>
          <Link to='/register'>| Register |</Link>
          <Link to='/login'>| Login ||</Link>
        </aside>

        <main>
          <Switch>
            <Route exact path='/' component={HomePage} />
            <Route exact path='/login' component={logged ?
              () => { 
                alert("you are logged in. Redirecting to home")
                return (<Redirect to='/' />)
              } : () => { 
                return <LoginPage />
              }
            }>
            </Route>
            <Route path='/register' component={RegisterPage}/>
            <Route path='/tasks' component={logged ?
              () => { 
                return <TasksPage />
              } : () => { 
                alert("you aren't logged in. Redirecting to login")
                return <LoginPage />
              }
            }></Route>
            <Route exact path="/task/:id" render={({ match }) => (
              <TaskDetailPage task={taskList[match.params.id - 1]} />
            )} />
            {/* 404 - Page No Found */}
            <Route path='*' component={NotFoundPage} />
          </Switch>
        </main>
      </div>
    </Router>
  );
}

export default AppRoutingOne;
