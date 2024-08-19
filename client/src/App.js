import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './Login';
import Callback from './Callback';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/oauth2/redirect/:provider" element={<Callback />} />
      </Routes>
    </Router>
  );
}

export default App;
