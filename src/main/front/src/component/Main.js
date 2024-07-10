import React from 'react';
import { Link } from 'react-router-dom';

const Main = () => {
    return (
        <div>
            메인 페이지<br/>

            <Link to="/joinPage">회원가입</Link><br/>
            <Link to="/loginPage">로그인</Link><br/>
            <Link to="/board">게시판</Link><br/>
        </div>
    );
};

export default Main;