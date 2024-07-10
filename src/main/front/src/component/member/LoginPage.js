import { Button, TextField } from '@mui/material';
import React from 'react';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router-dom';

const LoginPage = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    
    return (
        <div>
            로그인
            <TextField label="아이디" variant="outlined"/>
            <TextField label="비밀번호" variant="outlined" type='password'/>
            <Button variant="outlined" id='loginBtn'>로그인</Button>
            <Button variant="contained" id='joinPageBtn'>회원가입</Button>
        </div>
    );
};

export default LoginPage;