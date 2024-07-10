const initialState = {
    list: [], bseq: 0,  title: '',  content: '',  writer: '', writeDate: ''
};

export default function boardReducer(state = initialState, action) {
	switch (action.type) {
        case 'getBoardList': {
            return {
                ...state,
                list: action.payload
            }
        }
        case 'view': {
            return {

            }
        }
		case 'insert': {
			return {

            }
		}
        case 'update': {
            return {

            }
        }
        case 'delete': {
            return {

            }
        }
		default:
			return state
	}
}