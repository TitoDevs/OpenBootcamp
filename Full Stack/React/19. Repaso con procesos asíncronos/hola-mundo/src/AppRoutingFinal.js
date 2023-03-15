import { BrowserRouter as Router, Route, Switch, Redirect } from 'react-router-dom'
import DashboardPage from './pages/dashboard/DashboardPage'
import NotFoundPage from './pages/404/NotFoundPage'
import LoginPage from './pages/auth/LoginPage'

function AppRoutingFinal() {

  //TODO Change to value from sessionStorage for something dinamic
  let loggedIn = true;

  return (
    <Router>
      {/* Route Switch */}
      <Switch>
        {/* Redirections to protect our routes */}
        <Route exact path='/'>
          {
            loggedIn ? 
            (<Redirect from='/' to='/dashboard'/>)
            :
            (<Redirect from='/' to='/login'/>)
          }
        </Route>
        {/* Login Route */}
        <Route exact path='/login' component={LoginPage}/>
        {/* Dashboard Route */}
        <Route exact path='/dashboard'>
          {
            loggedIn ? 
            (<DashboardPage/>)
            :
            (<Redirect from='/' to='/login'/>)
          }
        </Route>
        <Route component={NotFoundPage}/>
      </Switch>
    </Router>
  );
}

export default AppRoutingFinal;
