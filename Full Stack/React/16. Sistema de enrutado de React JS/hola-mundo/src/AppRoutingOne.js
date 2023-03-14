import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom'
import HomePage from './pages/home/HomePage';
import NotFoundPage from './pages/404/NotFoundPage'
import AboutPage from './pages/about-faqs/AboutPage';
import ProfilePage from './pages/profile/ProfilePage';
import TasksPage from './pages/tasks/TasksPage';
import TaskDetailPage from './pages/tasks/TaskDetailPage';

function AppRoutingOne() {
  return (
    <Router>
      <div>
        <aside>
          <Link to='/'>|| Home |</Link>
          <Link to='/about'>| About |</Link>
          <Link to='/faqs'>| FAQs ||</Link>
          <Link to='/any404'>| No Existing Route ||</Link>
        </aside>

        <main>
          <Routes>
            <Route exact path='/' Component={HomePage} />
            <Route path='/about' Component={AboutPage} />
            <Route path='/faqs' Component={AboutPage} />
            <Route path='/profile' Component={ProfilePage} />
            <Route path='/tasks' Component={TasksPage} />
            <Route path='/tasks/:id' Component={TaskDetailPage}/>
            {/* 404 - Page No Found */}
            <Route path='*' Component={NotFoundPage} />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default AppRoutingOne;
