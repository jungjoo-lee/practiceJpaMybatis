import { Box, Button, TextField } from '@mui/material';
import React, { useCallback, useState } from 'react';
import { useDispatch } from 'react-redux';
import { joinMember } from '../../reducers/member/joinMember';
import { useNavigate } from 'react-router-dom';

const MemoizedTextField = React.memo(({ id, label, value, onChange, type = 'text', autoComplete }) => {
    return (
        <TextField
            id={id}
            label={label}
            value={value}
            onChange={onChange}
            type={type}
            autoComplete={autoComplete}
            sx={{ m: 1, width: '25ch' }}
        />
    );
});

const JoinPage = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const [member, setMember] = useState({
        userid: '',
        pwd: '',
        name: '',
        email: '',
        address: ''
    });

    const handleChange = useCallback((e) => {
        const { id, value } = e.target;
        
        setMember((prevFormData) => ({
            ...prevFormData,
            [id]: value
        }));
    }, []);

    const handleJoin = useCallback(() => {
        dispatch(joinMember(member))
        .then(() => {
            navigate('/');
        })
        .catch((error) => {
            console.error(error);
        });
    }, [dispatch, member, navigate]);

    return (
        <div>
            <Box component="form" noValidate autoComplete="off">
                아이디 : <MemoizedTextField id="userid" label="userid" value={member.userid} onChange={handleChange} />
                비밀번호 : <MemoizedTextField id="pwd" label="Password" type="password" autoComplete="current-password" value={member.pwd} onChange={handleChange} />
                이름 : <MemoizedTextField id="name" label="name" value={member.name} onChange={handleChange} />
                이메일 : <MemoizedTextField id="email" label="email" value={member.email} onChange={handleChange} />
                주소 : <MemoizedTextField id="address" label="address" value={member.address} onChange={handleChange} />
            </Box>
            <Box>
                <Button variant="contained" id='joinBtn' onClick={handleJoin}>회원가입</Button>
                <Button variant="outlined" id='reset' onClick={() => setMember({ userid: '', pwd: '', name: '', email: '', address: '' })}>초기화</Button>
            </Box>
        </div>
    );
};

export default JoinPage;