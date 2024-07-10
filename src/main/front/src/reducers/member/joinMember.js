import axios from "axios";

const joinMember = (memberData) => {
    return (dispatch) => {
        return axios.post("http://localhost:8090/member/join", memberData)
            .then((res) => {
                alert(res.data);
                dispatch({ type: 'join', payload: memberData });
            })
            .catch((error) => {
                console.error(error);
                throw error;
            });
    };
};

export { joinMember };