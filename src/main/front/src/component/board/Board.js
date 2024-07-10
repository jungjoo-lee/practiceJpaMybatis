import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';

const getBoardList = () => {
    return axios.get('http://localhost:8090/board/board')
        .then(res => res.data)
        .catch(error => {
            console.error(error);
            throw error;
        });
};

const Board = () => {
    const dispatch = useDispatch();
    const boardList = useSelector(state => state.board.list);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    
    useEffect(() => {
        getBoardList()
            .then(data => {
                dispatch({ type: 'getBoardList', payload: data });
                setLoading(false);
            })
            .catch(err => {
                setError(err);
                setLoading(false);
            });
    }, [dispatch]);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error.message}</div>;

    return (
        <div>
            게시판
            <ul>
                {boardList.map((boardItem) => (
                    <li key={boardItem.bseq}>
                        {boardItem.title} - {boardItem.writer} - {boardItem.writeDate}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default Board;