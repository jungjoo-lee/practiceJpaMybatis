const initialState  = {
	userid: '', pwd: '', name: '', email: '', address: ''
}

export default function memberReducer(state = initialState , action) {
	switch (action.type) {
		case 'join': {
			return {
                ...state,
                ...action.payload
            };
		}
		case 'login': {
			return {
				...state,
				...action.payload
			}
		}
		case 'logout': {
			return {
				...state,
				value: 0
			}
		}
		default:
			return state
	}
}