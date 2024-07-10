import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Layout from './layout/Layout';
import Main from './component/Main';
import Board from './component/board/Board';
import JoinPage from './component/member/JoinPage';
import LoginPage from './component/member/LoginPage';

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Layout />}></Route>
        <Route index element={<Main />}></Route>
        <Route path='/joinPage' element={<JoinPage />}></Route>
        <Route path='/loginPage' element={<LoginPage />}></Route>
        <Route path='/board' element={<Board />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
