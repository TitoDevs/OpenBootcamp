import { BrowserRouter as Router, Route, Switch, Link, Redirect } from 'react-router-dom'
import { useEffect, useState } from 'react';
import HomePage from './pages/home/HomePage';
import NotFoundPage from './pages/404/NotFoundPage'
import AboutPage from './pages/about-faqs/AboutPage';
import ProfilePage from './pages/profile/ProfilePage';
import TasksPage from './pages/tasks/TasksPage';
import TaskDetailPage from './pages/tasks/TaskDetailPage';
import LoginPage from './pages/auth/LoginPage';
import StatePage from './pages/home/StatePage';

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
      <div>
        <aside>
          <Link to='/'>|| Home |</Link>
          <Link to='/about'>| About |</Link>
          <Link to='/faqs'>| FAQs |</Link>
          <Link to='/task/1'>| Task1 |</Link>
          <Link to='/task/2'>| Task2 |</Link>
          <Link to='/any404'>| No Existing Route |</Link>
          <Link to='/login'>| Login ||</Link>
        </aside>

        <main>
          <Switch>
            <Route exact path='/' component={HomePage} />
            <Route exact path='/online-state' component={StatePage} />
            <Route exact path='/login' component={logged ?
              () => { 
                alert("you are logged in. Redirecting to home")
                return (<Redirect to='/' />)
              } : () => { 
                return <LoginPage />
              }
            }>
            </Route>
            <Route path='/about' component={AboutPage} />
            <Route path='/faqs' component={AboutPage} />
            <Route path='/profile' component={
              logged ? 
                ProfilePage
              : 
                () => { 
                  alert('You must be logged in. Redirecting to login...')
                  return (<Redirect to='/login'/>)
                }
              }>
            </Route>
            <Route path='/tasks' component={TasksPage}/>
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
